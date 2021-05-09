/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 

Example 1:


Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* curr = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    
    if (l1==NULL)
        return l2;
    if(l2==NULL)
        return l1;
    
    
    if (l1->val < l2->val) {
            curr -> next = l1;
            head = l1;
            curr = curr -> next;
            l1 = l1 -> next;
        }
        else {
            curr->next = l2;
            head = l2;
            curr = curr->next;
            l2 = l2->next;
        }    
    
    while (l1 != NULL && l2 != NULL) {
        if (l1->val < l2->val) {
            curr -> next = l1;
            curr = curr -> next;
            l1 = l1 -> next;
        }
        else {
            curr->next = l2;
            curr = curr->next;
            l2 = l2->next;
        }
    }
    if (l1==NULL) {
        curr->next = l2;
    }
    else if (l2==NULL) {
        curr->next = l1;
    }
    return head;
}