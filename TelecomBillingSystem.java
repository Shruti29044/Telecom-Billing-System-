
// Telecom Billing System - Java Project

import java.util.*;

// Plan base class
abstract class Plan {
    protected double ratePerUnit;
    protected String planType;

    public Plan(double ratePerUnit, String planType) {
        this.ratePerUnit = ratePerUnit;
        this.planType = planType;
    }

    public abstract double calculateBill(double usage);
    public String getPlanType() { return planType; }
}

// Prepaid plan
class PrepaidPlan extends Plan {
    public PrepaidPlan() {
        super(0.5, "Prepaid");
    }

    @Override
    public double calculateBill(double usage) {
        return usage * ratePerUnit;
    }
}

// Postpaid plan
class PostpaidPlan extends Plan {
    private double monthlyFee = 20;

    public PostpaidPlan() {
        super(0.3, "Postpaid");
    }

    @Override
    public double calculateBill(double usage) {
        return monthlyFee + (usage * ratePerUnit);
    }
}

// Subscription class
class Subscription {
    private Plan plan;
    private double usage; // total units used (voice/data/sms combined for simplicity)

    public Subscription(Plan plan, double usage) {
        this.plan = plan;
        this.usage = usage;
    }

    public double generateBill() {
        return plan.calculateBill(usage);
    }

    public String getPlanType() {
        return plan.getPlanType();
    }

    public double getUsage() {
        return usage;
    }
}

// Customer class
class Customer {
    private String name;
    private List<Subscription> subscriptions;

    public Customer(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public void addSubscription(Subscription sub) {
        subscriptions.add(sub);
    }

    public void printBill() {
        System.out.println("\nBilling report for: " + name);
        double total = 0;
        for (Subscription sub : subscriptions) {
            double bill = sub.generateBill();
            System.out.printf("Plan: %s | Usage: %.2f units | Bill: $%.2f\n",
                    sub.getPlanType(), sub.getUsage(), bill);
            total += bill;
        }
        System.out.printf("Total Amount Due: $%.2f\n", total);
    }
}

public class TelecomBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        Customer customer = new Customer(name);

        String more;
        do {
            System.out.println("Choose Plan: 1) Prepaid  2) Postpaid");
            int planChoice = scanner.nextInt();
            Plan plan = (planChoice == 1) ? new PrepaidPlan() : new PostpaidPlan();

            System.out.println("Enter usage units:");
            double usage = scanner.nextDouble();

            Subscription subscription = new Subscription(plan, usage);
            customer.addSubscription(subscription);

            System.out.println("Add another subscription? (yes/no):");
            scanner.nextLine(); // consume newline
            more = scanner.nextLine();
        } while (more.equalsIgnoreCase("yes"));

        customer.printBill();
        scanner.close();
    }
}
