import java.util.*;

public class MyClassRRT {
    public static RRT getHighestPriority(RRT[] rrt, String project) {
        int maxi = Integer.MAX_VALUE;
        RRT ans = null;
        for(RRT r:rrt) {
            if(r.getPriority() < maxi && r.getProject().equalsIgnoreCase(project)) {
                maxi = r.getPriority();
                ans = r;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RRT[] rrt = new RRT[n];
        for(int i = 0;i<n;i++) {
            int ticketNo = sc.nextInt();
            sc.nextLine();
            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();
            
            rrt[i] = new RRT(ticketNo, raisedBy, assignedTo, priority, project);
        }
        String pr = sc.nextLine();

        System.out.println("                        ");

        RRT ans = getHighestPriority(rrt, pr);
        if(ans == null) {
            System.out.print("No such ticket");
        } else {
            System.out.println(ans.getTicketNo());
            System.out.println(ans.getRaisedBy());
            System.out.println(ans.getAssignedTo());
        }
    }

}

class RRT {
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public int getTicketNo() {
        return ticketNo;
    }
    public String getRaisedBy() {
        return raisedBy;
    }
    public String getAssignedTo() {
        return assignedTo;
    }
    public int getPriority() {
        return priority;
    }
    public String getProject() {
        return project;
    }
}