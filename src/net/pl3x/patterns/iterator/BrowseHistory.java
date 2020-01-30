package net.pl3x.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    // Fixed size array
    private String[] urls = new String[10];
    private int count;
    //private List<String> urls = new ArrayList<>();

    public void push(String url){
        /*
        urls[count] = url;
        count++;
         */

        // Cleaner implementation of above is:
        urls[count++] = url;
    }

    public String pop() {
        /*
        count--;
        return urls[count];
         */

        // Cleaner implementation of above is:
        return urls[--count];
    }

    /*
     * We do not want this because we do not want anyone outside this program to know
     * what type of list or array we have so instead we will create a new method
     * called 'createIterator(){ }'
     *
    public List<String> getUrls() {
        return urls;
    }
    * */

    public Iterator createIterator() {
        // return new ListIterator(this);
        return new ArrayIterator(this);
    }

    /**
     * ArrayIterator Class that enables us to iterator between the browse history
     */
    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory browseHistory;
        private int index;

        public ArrayIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browseHistory.count);
        }

        @Override
        public String current() {
            return browseHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

    /*
     * Nested Class
     *
     * This ListIterator knows how to list over a list of URLs
     * This type class is needed for a List<String> Iterator
     *
    public class ListIterator implements Iterator<String> {
        private BrowseHistory browseHistory;
        private int index;

        public ListIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browseHistory.urls.size());
        }

        @Override
        public String current() {
            return browseHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
     */


    /*
	 * This is not a good implementation because if we decide to change the
	 * data structure for which how we list the browser history this will break what we have below
    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() -1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
     */
}
