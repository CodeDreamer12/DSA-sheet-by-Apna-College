         stack <pair<int,int>> s;
         s.push({intervals[0].first,intervals[0].second});
         for(int i=1; i<intervals.size(); i++){
             int start1=s.top().first;
             int end1=s.top().second;
             int start2=a[i].first;
             int end2=a[i].second;
             if(end1<start2){
                 s.push({start2,end2});
             }
             else{
                 s.pop();
                 end1=Math.max(end1,end2);
                 s.push({start1,end1});
             }
         }
         while(!s.empty()){
             return s.top().first<<" "<<s.top().second;
             s.pop();
         }
