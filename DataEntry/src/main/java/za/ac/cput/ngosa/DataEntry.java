package za.ac.cput.ngosa;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class DataEntry
{
    Scanner scanner= new Scanner(System.in);
    String fname;
    String lname;
    int location;
    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = scanner.nextDouble();
    }

    public int getLocation() {
        return location;
    }

    public void setLocation() {
        this.location = scanner.nextInt();
    }

    public String getFname() {
        return fname;
    }

    public void setFname() {
        this.fname = scanner.nextLine();
    }

    public String getLname() {
        return lname;
    }

    public void setLname() {
        this.lname = scanner.nextLine();
    }


}
