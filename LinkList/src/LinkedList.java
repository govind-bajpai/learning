
// Java program to detect loop in a linked list
import java.util.*;

public class LinkedList {

	static Node head; // head of list

	/* Linked list Node */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	static public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Returns true if there is a loop in linked
	// list else returns false.
	static int detectLoop(Node h, int n, int i) {
		if (h == null) {
			return i + 1;
		}

		i = detectLoop(h.next, n, i);
		System.out.println(i + "  |" + n + " |" + h.data);
		if (i == n) {
			System.out.println(h.data);
		}
		return i + 1;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.push(11);
		llist.push(13);
		llist.push(16);
		llist.push(22);
		// detectLoop(head,6,0);

		System.out.println("Print List");
		printList(head);
		System.out.println("Print List Pair wise swap");
		head = pairWiseSwap(head);
		printList(head);
		System.out.println("Print List reverse");
		head = reverse(head);

		printList(head);
		System.out.println("Print List 3 Pair wise swap");
		head = kPairWiseSwap(head,3);

		printList(head);

	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();

	}

	public static Node pairWiseSwap(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node temp = node.next;
		node.next = temp.next;
		temp.next = node;
		node.next = pairWiseSwap(node.next);
		return temp;
	}

	public static Node kPairWiseSwap(Node head, int k) {
		if (head == null) {
			return head;
		}
		Node temp = head;
		int count = 1;
		while (count < k && temp != null) {
			temp = temp.next;
			count++;
		}
		if (count < k || temp == null) {
			return head;
		}

		Node temp2 = temp.next;
		temp.next = null;
		temp=head;
		head = reverse(head);
		temp.next = kPairWiseSwap(temp2,k);
		
		return head;
	}

	private static Node reverse(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node prev = null;
		Node curr = head;
		Node next = head.next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}

// This code is contributed by Arnav Kr. Mandal.
