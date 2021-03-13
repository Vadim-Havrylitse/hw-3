class ATM{
  public int countBanknotes(int sum){
    int [] arr = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int n = 0;
    int i = 0 ;
    while (i < arr.length){
      while ( true==true){
        if (sum - arr[i] >= 0){
          n++;
          sum -= arr[i];
          continue;
        }
        break;
      }
      i++;
    }
    return n;
  }
}
          
