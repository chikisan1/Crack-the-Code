import java.util.*;
public class Rdups{
  /*
  Remove Dups: Write code to remove duplicates from an unsorted linked list. FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed? Hints: #9, #40
  */

  class Node {
    Node next = null;
    Node prev = null;
    int data;

    public Node(int data){
      this.data = data;
      this.next = next;
      this.prev = prev;
    }

    public void appendToTail(int data, Node head){
      Node end = new Node(data);
      Node cur = head;
      while(cur.next != null){
        cur = cur.next;
      }
      cur.next = end;
      cur.next.prev = cur;

    }
  }


  public static void deleteByHash(Node cur){
    HashSet<Integer> set = new HashSet<Integer>();
    Node prev = null;
    while(cur != null){
      if(set.contains(cur.data)){
        prev.next = cur.next;
      }
      else{
        set.add(cur.data);
        prev = cur;
      }
      cur = cur.next;
    }

  }

  public static void deleteDups(Node head){
    Node cur = head;
    while(cur != null){
      Node runner = cur;
      while(runner.next != null){
        if(runner.next.data == cur.data){
          runner.next = runner.next.next;
        }
        else{
          runner = runner.next;
        }

      }
      cur = cur.next;
    }
  }

  public static void printList(Node head){
    while(head != null){
      System.out.print(head.data + "->");
      head = head.next;
    }
  }

  public static void main(String [] args){
    Node list = new Node(6);
    appendToTail(5, list);
    appendToTail(4, list);
    appendToTail(6, list);
    printList(list);

  }

}
