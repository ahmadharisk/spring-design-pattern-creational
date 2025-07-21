package com.peppo.spring.creational.factory.method;

import lombok.Getter;

public class InstagramSocialMedia implements SocialMedia {
    @Getter
    private final String name = "Instagram";

    @Getter
    private final String url = "https://www.instagram.com";

    @Getter
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;

    @Override
    public String toString() {
        return "InstagramSocialMedia{" +
            "name='" + name + '\'' +
            ", url='" + url + '\'' +
            ", type=" + type +
            '}';
    }
}
