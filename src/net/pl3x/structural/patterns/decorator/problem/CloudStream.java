package net.pl3x.structural.patterns.decorator.problem;

/*
 * Read or write data to the cloud
 */
public class CloudStream {

    /**
     * Get inputted data
     *
     * @param data Get data
     */
    public void write(String data){
        System.out.println("Storing " + data);
    }
}
