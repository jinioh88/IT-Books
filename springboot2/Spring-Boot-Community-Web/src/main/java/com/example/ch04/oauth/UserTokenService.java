//package com.example.ch04.oauth;
//
//import com.example.ch04.domain.enums.SocialType;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
//
//import java.util.List;
//import java.util.Map;
//
//public class UserTokenService implements ResourceServerTokenServices {
//
//    public UserTokenService(ClientResources resources, SocialType socialType) {
////        super(resources.getResource().getUserInfoUri(), resources.getClient().getClientId());
////        setAuthoritiesExtractor(new OAuth2AuthoritiesExtractor(socialType));
//    }
//
//    @Override
//    public OAuth2Authentication loadAuthentication(String accessToken) throws AuthenticationException, InvalidTokenException {
//        return null;
//    }
//
//    @Override
//    public OAuth2AccessToken readAccessToken(String accessToken) {
//        return null;
//    }
//
//    public static class OAuth2AuthoritiesExtractor implements AuthoritiesExtractor {
//        private String socialType;
//
//        public OAuth2AuthoritiesExtractor(SocialType socialType) {
//            this.socialType = String.valueOf(socialType);
//        }
//
//        @Override
//        public List<GrantedAuthority> extractAuthorities(Map<String, Object> map) {
//            return AuthorityUtils.createAuthorityList(this.socialType);
//        }
//    }
//}
