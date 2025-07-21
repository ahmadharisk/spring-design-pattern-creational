package com.peppo.spring.creational.factory.inheritance;

import com.peppo.spring.creational.factory.method.FacebookV2SocialMedia;
import com.peppo.spring.creational.factory.method.InstagramSocialMedia;
import com.peppo.spring.creational.factory.method.SocialMedia;
import com.peppo.spring.creational.factory.method.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new FacebookV2SocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return new TwitterSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return new InstagramSocialMedia();
    }
}
