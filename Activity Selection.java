class meetPair{
    int start;
    int end;
    meetPair(int start, int end){
        this.start=start;
        this.end=end;
    }
}
class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        ArrayList<meetPair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new meetPair(start[i],end[i])); 
        }
        Collections.sort(list, (m1, m2) -> (m1.end - m2.end));
        int ans = 1;
        int prev = list.get(0).end;
        for (int i = 1; i < n; i++) {
            if (list.get(i).start >prev) {
                prev=list.get(i).end;
                ans++;
            }
        }
        return ans;
    }
}
