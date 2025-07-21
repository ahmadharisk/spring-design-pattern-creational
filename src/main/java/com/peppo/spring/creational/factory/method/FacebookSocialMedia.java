package com.peppo.spring.creational.factory.method;

import lombok.Getter;

@Deprecated
public class FacebookSocialMedia implements SocialMedia {

    @Getter
    private final String name = "Facebook";

    @Getter
    private final String url = "https://www.facebook.com";

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
