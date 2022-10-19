class array{
    public static void main(String[] args) {
        
        String[] arr; //何のデータ型の何という配列か。
        arr = new String[3]; //要素数を入れる時には、newを入れる。
        arr[0] = "sato";
        arr[1] = "suzuki";
        arr[2] = "takahashi";

        // String[] arr = {"sato","suzuki","tanaka"}; //これでも↑とやっていることは一緒。

        System.out.println(arr[0]);
    }    
}