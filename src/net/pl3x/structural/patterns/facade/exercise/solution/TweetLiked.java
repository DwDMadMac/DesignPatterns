package net.pl3x.structural.patterns.facade.exercise.solution;

public class TweetLiked {
    private boolean tweetLiked;

    /**
     * This will set the tweet liked to true or false
     *
     * @param tweetLiked Set true or false
     */
    public void setTweetLiked(boolean tweetLiked) {
        this.tweetLiked = tweetLiked;
    }

    /**
     * Checks to see if a tweet was liked or not
     *
     * @return Return true is tweet was liked
     */
    public boolean isTweetLiked() {
        return tweetLiked;
    }

    /**
     *
     * @return
     */
    public boolean likeTweet(){
        if (isTweetLiked()) {
            System.out.println("Tweet liked.");
        } else {
            System.out.println("Tweet not liked, do nothing");
        }

        return tweetLiked;
    }
}
