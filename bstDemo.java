import java.util.*;


class Node{
int data;
Node lchild,rchild;
}//node class



class btree extends Node{
Node p,q,temp,root;

void createTree(Node temp, Node q, int y)
{
if(y<temp.data){
if(temp.lchild==null)
temp.lchild = q;
else
createTree(temp.lchild,q,y);
}//if close
else{
if(y > temp.data){
if(temp.rchild==null)
temp.rchild=q;
else
createTree(temp.rchild,q,y);
}//if blovk closed
}//else block close
}//createTree close

void Preorder(Node root){

if(root!=null){
System.out.print(root.data+" ");
Preorder(root.lchild);
Preorder(root.rchild);
}
}//preorder close

void Postorder(Node root){

if(root!=null){

Postorder(root.lchild);
Postorder(root.rchild);
System.out.print(root.data+" ");
}
}//postorder close

void Inorder(Node root){

if(root!=null){

Inorder(root.lchild);
System.out.print(root.data+" ");
Inorder(root.rchild);

}
}//inorder close

}//class close

class bstDemo{
public static void main (String args[]){
btree obj = new btree();
Scanner sc = new Scanner(System.in);
Node p,q,temp,root=null;
if(root==null){
p = new Node();
System.out.println("Enter the root element to be inserted");
int x =sc.nextInt();
p.data=x;
p.lchild=null;
p.rchild=null;
root=p;
}

System.out.println("Enter the number of elememnts to be inserted");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
temp=root;
q=new Node();
System.out.println("Enter the element to be inserted");
int y =sc.nextInt();
q.data=y;
q.lchild=null;
q.rchild=null;
obj.createTree(temp,q,y);
}//for loop closed

obj.Preorder(root);
System.out.println("-- > preorder travelsal");
obj.Inorder(root);
System.out.println("--> inorder travelsal");
obj.Postorder(root);
System.out.println("--> postorder travelsal");
}//main methos closed
}// class closed 