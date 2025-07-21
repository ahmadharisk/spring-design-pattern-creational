package com.peppo.spring.creational.factory.method;

import lombok.Getter;

public class FacebookV2SocialMedia implements SocialMedia {

    @Getter
    private final String name = "Facebook";

    @Getter
    private final String url = "https://web.facebook.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.FACEBOOK;

    @Override
    public String toString() {
        return "FacebookSocialMedia{" +
            "name='" + name + '\'' +
            ", url='" + url + '\'' +
            ", type=" + type +
            '}';
    }
}
