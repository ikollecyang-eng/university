import java.util.ArrayList;
import java.util.Collection;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//1.通过多态形式来创建集合对象
        Collection u=new ArrayList();
        //向集合u中添加对象
        u.add("剑桥大学");
        u.add("牛津大学");
        u.add("帝国理工学院");
        u.add("伦敦大学");
        u.add("伦敦政治经济学院");
//2.列出集合中所有的元素
        System.out.println(u);
//3.删除集合中的元素
        u.remove("帝国理工学院");//表示丢弃返回值，不接收返回值，无法确定此指令是否执行成功
        if(u.remove("伦敦大学")){
            System.out.println("你已经把帝国理工学院删除了");
            System.out.println(u);
        }
//4.查看集合元素个数
     int num=u.size(); //记得有括号

    }

}