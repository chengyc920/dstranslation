package com.derbysoft.dhplatform.dhtranslation.proxy;


public class AuthenticationResponse {
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public static class Response {
        private String code;
        private Data data;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public static class Data {
            private String accessToken;
            private Integer expiresIn;
            private Integer refreshExpiresIn;
            private String refreshToken;
            private String tokenType;
            private String sessionState;

            public String getAccessToken() {
                return accessToken;
            }

            public void setAccessToken(String accessToken) {
                this.accessToken = accessToken;
            }

            public Integer getExpiresIn() {
                return expiresIn;
            }

            public void setExpiresIn(Integer expiresIn) {
                this.expiresIn = expiresIn;
            }

            public Integer getRefreshExpiresIn() {
                return refreshExpiresIn;
            }

            public void setRefreshExpiresIn(Integer refreshExpiresIn) {
                this.refreshExpiresIn = refreshExpiresIn;
            }

            public String getRefreshToken() {
                return refreshToken;
            }

            public void setRefreshToken(String refreshToken) {
                this.refreshToken = refreshToken;
            }

            public String getTokenType() {
                return tokenType;
            }

            public void setTokenType(String tokenType) {
                this.tokenType = tokenType;
            }

            public String getSessionState() {
                return sessionState;
            }

            public void setSessionState(String sessionState) {
                this.sessionState = sessionState;
            }
        }
    }
}

