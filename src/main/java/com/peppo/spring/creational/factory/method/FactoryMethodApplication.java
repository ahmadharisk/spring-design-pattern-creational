package com.peppo.spring.creational.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMedia(SocialMediaType socialMediaType) {
        if (socialMediaType == SocialMediaType.FACEBOOK) {
            return new FacebookV2SocialMedia();
        }
        if (socialMediaType == SocialMediaType.TWITTER) {
            return new TwitterSocialMedia();
        }
        if (socialMediaType == SocialMediaType.INSTAGRAM) {
            return new InstagramSocialMedia();
        }
        throw new IllegalArgumentException("SocialMediaType " + socialMediaType + " not supported");
    }

}
