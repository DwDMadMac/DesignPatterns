package net.pl3x.structural.patterns.facade.exercise.solution;

/**
 * This class is for demo purposes
 */
public class Demo {
  /**
   * This method will now use the newly created Twitter API using the
   * custom "App Key" with the custom "App Secret". this allows us to
   * use the twitter API get Twitters recent tweets without needing
   * to add repetitive code.
   *
   * Now let's say we wanted to add additional operations such as "liking a tweet"
   * or "Composing a new tweet". We can easily do this by calling the "twitterAPI"
   * object with its given method. Example below.
   */
  public static void show() {
    var twitterAPI = new TwitterAPI("appKey","appSecret");
    var tweets = twitterAPI.getRecentTweets();
    var newTweet = twitterAPI.sendNewTweet();
    var tweetLiked = twitterAPI.tweetLiked();
  }
}
