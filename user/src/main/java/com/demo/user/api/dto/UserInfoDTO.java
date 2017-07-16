package com.demo.user.api.dto;


public final class UserInfoDTO {
    private Long id;
    private String username;
    private String phone;
    private String address;

    private UserInfoDTO(Builder builder) {
        id = builder.id;
        username = builder.username;
        phone = builder.phone;
        address = builder.address;
    }

    public static Builder userInfoDTO() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


    public static final class Builder {
        private Long id;
        private String username;
        private String phone;
        private String address;

        private Builder() {
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserInfoDTO build() {
            return new UserInfoDTO(this);
        }
    }
}
