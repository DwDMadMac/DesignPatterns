package net.pl3x.structural.patterns.facade.exercise.solution;

public class OAuth {
  public String requestToken(String appKey, String appSecret) {
    System.out.println("Get a request token");
    return "requestToken";
  }

  public String getAccessToken(String requestToken) {
    System.out.println("Get an access token");
    return "accessToken";
  }
}
