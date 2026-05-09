package com.mcee.auctn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;

@Configuration
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { // try-catch 말고 throws Exception 처리 해야 Bean 생성 실패 시 서버가 기동되지 않음.
		http
			.authorizeHttpRequests((auth) -> auth
                .dispatcherTypeMatchers(
                        DispatcherType.FORWARD,
                        DispatcherType.ERROR
                    ).permitAll()
				.requestMatchers(
					"/",
					"/com/lgn/lgn.do",
					"/com/lgn/mbrJoin.do",
					"/css/**",
					"/images/**",
					"/js/**"
				).permitAll()
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form
				.loginPage("/com/lgn/lgn.do")
				.loginProcessingUrl("/com/lgn/lgnProc.do") // URL을 Spring Security 필터가 가로챌 것이므로, 컨트롤러에 등록하지 않는다.
				.usernameParameter("id")
				.passwordParameter("pswd")
				.defaultSuccessUrl("/com/main/main.do", true) // true로 설정하면 이전 요청과 상관없이 지정한 URL로 이동한다.
				.failureUrl("/com/lgn/lgn.do?error")
				.permitAll()
			);
//			.logout((logout) -> logout
//				.logoutUrl(null)
//				.logoutSuccessUrl(null)
//				.invalidateHttpSession(true)
//				.deleteCookies("JSESSIONID")
//			);
		
		return http.build();
	}
}
