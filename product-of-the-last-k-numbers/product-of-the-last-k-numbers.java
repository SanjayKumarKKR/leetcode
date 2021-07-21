class ProductOfNumbers {
    ArrayList<Integer> list;
    public ProductOfNumbers() {
        this.list = new ArrayList<>(); 
    }
    
    public void add(int num) {
        if(num==0){
            list=new ArrayList<>();
        }
        list.add(num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        int m = list.size()-1;
        for(int i=k;i>0;i--){
            pro =pro * list.get(m--);
            if(pro==0){
                return 0;
            }
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */