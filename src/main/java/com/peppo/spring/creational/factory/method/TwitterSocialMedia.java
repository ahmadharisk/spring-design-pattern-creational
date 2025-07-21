package com.peppo.spring.creational.factory.method;

import lombok.Getter;

public class TwitterSocialMedia implements SocialMedia {

    @Getter
    private final String name = "Twitter";

    @Getter
    private final String url = "https://www.x.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.TWITTER;

    @Override
    public String toString() {
        return "TwitterSocialMedia{" +
            "name='" + name + '\'' +
            ", url='" + url + '\'' +
            ", type=" + type +
            '}';
    }
}
