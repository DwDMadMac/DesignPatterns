package net.pl3x.structural.patterns.facade.exercise.problem;

public class Demo {
  public static void show() {
    var oauth = new OAuth();
    var requestToken = oauth.requestToken("appKey", "secret");
    var accessToken = oauth.getAccessToken(requestToken);

    var twitterClient = new TwitterClient();
    var tweets = twitterClient.getRecentTweets(accessToken);
  }
}
