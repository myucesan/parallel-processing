# Minimising Maximum Lateness with only one resource
**This implementation is finished. Might also use a priority queue which is more efficient.**

We have $m$ processors and $n$ jobs. Each job $i$ in $\{1, \ldots, n\}$ has a processing time of exactly 1 hour. Furthermore, each job $i$ has an integer deadline $d_i$ in hours. The aim is to find a start time $s_i$ and processor $p_i$ for each job such that no jobs are run at the same processor at the same time and such that the maximum lateness over all jobs is minimized. The lateness is the time a job finishes compared to its deadline, defined here by $s_i+1-d_i$. The objective thus is to minimize $\max _i\\{s_i+1-d_i\\}$.

Create a greedy algorithm to determine a schedule that has the smallest maximum lateness. Given 2 processors and the following 5 deadlines:
``3,1,1,1,2``
your algorithm should return the minimized maximum lateness, in this case: 1 . 