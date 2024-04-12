// Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.
// Job A = 4, 20
// Job B = 1, 10
// Job C = 1, 40
// Job D = 1, 30

// Solution.

/*
Sort jobs on basis of profit => C, D, A, B.
track time And create an AL to Track all Done JOBS
for(i to jobs){
    if(job.deadline > time){
        add job in ans 
        time++
    }
}

// Special note : we will be learning how to sort object in this video
Collections.sort(ArrayList obj, (obj1, obj2) -> obj2.profit-obj1.profit)//To sort in decreasing order of profit
 */

import java.util.*;

public class JobSequencingProblem {

    static class Job{
        int deadline;
        int profit;
        int id;
        Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static int JobSequencing(Job jobs[], int n) {
        Arrays.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit); //descending order of profit
        
        int maxDeadline = 0;
        for(int i = 0; i < n; i++){
            if (jobs[i].deadline > maxDeadline) {
                maxDeadline = jobs[i].deadline;
            }
        }

        int[] jobsDone = new int[maxDeadline+1];
        for(int i = 0; i <= maxDeadline; i++){
            jobsDone[i] =-1;
        }

        int noOfJobs = 0;
        int totalProfit = 0;
        for(int i = 0; i < n; i++){
            for(int j = jobs[i].deadline; j > 0; j--){
                if(jobsDone[j] == -1){
                    jobsDone[j] = jobs[i].id;
                    totalProfit += jobs[i].profit;
                    noOfJobs++;
                    break;
                }
            }
        }
        System.out.println("Jobs Completion Sequence :");
        for(int i = 0; i < jobsDone.length; i++){
            if(jobsDone[i] != -1){
                System.out.print(jobsDone[i]+ " ");
            }
        }
        System.out.println();
        System.out.println("Total Jobs Done = " + noOfJobs);

        return totalProfit;

    }
    public static void main(String args[]){
        int jobsInfo[][] = {{3,1}, {3,10}, {3,5}, {2, 20}, {1,15}};
        Job[] jobs = new Job[jobsInfo.length];
        for(int i = 0; i < jobsInfo.length; i++){
            jobs[i] = new Job(i, jobsInfo[i][0], jobsInfo[i][1]);
        }

        System.out.println(JobSequencing(jobs, jobsInfo.length));
    }
}
