package net.pl3x.structural.patterns.facade.exercise.solution;

import java.util.List;

/**
 * This class will handle all operations for Twitter
 */
public class TwitterAPI {
    private String appKey;
    private String secret;

    /**
     * This method intializes the TwitterAPI Objects
     *
     * @param appKey Get app key
     * @param secret get app secret
     */
    public TwitterAPI(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    /**
     * This method gets all the recently posted tweets
     *
     * @return Return list of recent tweets
     */
    public List<Tweet> getRecentTweets() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(getAccessToken());

        return tweets;
    }

    /**
     * This method will send newly created tweets by the users
     *
     * @return Return new tweet
     */
    public String sendNewTweet() {
        var tweet = new NewTweet();
        var newTweet = tweet.sendNewTweet("New Tweet");

        return newTweet;
    }

    /**
     * This method request for an access token
     *
     * @return Return access token
     */
    private String getAccessToken(){
        var oAuth = new OAuth();
        var requestToken = oAuth.requestToken("appKey","appSecret");
        var accessToken = oAuth.getAccessToken(requestToken);

        return accessToken;
    }

    /**
     * This method will check if the tweet is liked or not
     * This method is designed for demo purposes only
     *
     * @return Return boolean for liked tweet
     */
    public boolean tweetLiked(){
        var tweet = new TweetLiked();
        tweet.setTweetLiked(true);
        var tweetLiked = tweet.likeTweet();

        return tweetLiked;
    }
}
