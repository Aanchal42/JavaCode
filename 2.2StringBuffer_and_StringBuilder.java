
 class Demo {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Smith");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); //16 spaces extra
        sb.append(" John");
        System.out.println(sb);
 
       // String str = sb.toString();

        // sb.deleteCharAt(2);

        // sb.insert(0, "Java");

        // sb.insert(6, "java");

        // sb.setLength(30);

        // sb.ensureCapacity(2);

        System.out.println(sb);

    }

}
