/* まずは超ざっくり数字を覚えておく! */

/* 1.整数 */
// byte: -100 ~ 100
// short: -3万 ~ 3万
// int: -21億 ~ 21億（ゼロ9個）
// long: 1京（ゼロ16個）~   ...数字の最後にLを付ける。

/* 2.小数 */
// float: （小数点以下の桁数：少）...最後にFを付ける。
// double: （小数点以下の桁数：多）

/* 3.文字 */
// char: 文字が一つ。'シングルクオーテーション'で括る。
// String: 文字が複数。"ダブルクオーテーション"で括る。 ...正確にいうとclass名。

/* 4.ブール型 */
// boolean: true, false　の値を持つことができる。

class dataType{
    public static void main(String[] args) {
        
        // 1.整数--------------------------
        byte var1 = 1;
        short var2 = 12345;
        int var3 = 1234567890;
        long var4 = 1234567890000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        // 2.小数--------------------------
        float var5 = 1.1234F;
        double var6 = 1.123456789;

        System.out.println(var5);
        System.out.println(var6);

        // 3.文字--------------------------
        char var7 = 'c';
        String var8 = "hello, world!";

        System.out.println(var7);
        System.out.println(var8);
       
        // 4.ブール型--------------------------
        int var_a = 10;
        int var_b = 1;
        boolean var_bool;
        var_bool = (var_a > var_b);
        System.out.println(var_bool);   //true

    }
}