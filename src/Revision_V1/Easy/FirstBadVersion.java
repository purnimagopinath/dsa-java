package Revision_V1.Easy;
//
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isBadVersion(mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;

    }

    public boolean isBadVersion(int n){
        if(n%3==0) return true;
        return false;
    }
}
