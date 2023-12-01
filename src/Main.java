import java.util.Arrays;

public class Main {

    /**
     * @param n the number of jobs
     * @param m the number of processors
     * @param deadlines the deadlines of the jobs 1 through n. NB: you should ignore deadlines[0]
     * @return the minimised maximum lateness.
     */
    public static int solve(int n, int m, int[] deadlines) {
        // duration is 1 for all jobs
        int latestFinishingTime = 1;
        int processorsUsed = 1;
        int minimumMaxLateness = Integer.MIN_VALUE;
        Arrays.sort(deadlines, 1, n + 1);
        // we have m processors, and we want to use the second processor in a way that minimises the maximum lateness

        // realise that when you use an extra processor you do
        // not progress in time, as you do it at the same time as another job
        for (int i = 1; i <= n; i++) {
            minimumMaxLateness = Math.max(minimumMaxLateness, latestFinishingTime - deadlines[i]);

            if (processorsUsed < m) {
                processorsUsed++;

            } else {
                latestFinishingTime++;
                processorsUsed = 1;
            }
        }


        return minimumMaxLateness;
    }
}

