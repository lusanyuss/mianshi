package com.yuliu.demo.binarytree;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class DLinkedNode {
        public DLinkedNode pre;
        public DLinkedNode next;
        public int key;
        public int value;

        public DLinkedNode() {
        }

        public DLinkedNode(int keyParam, int valueParam) {
            key = keyParam;
            value = valueParam;
        }
    }

    public Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
    public int capacity;
    public int size;
    public DLinkedNode head, tail;

    public LRUCache(int capacityParam) {
        size = 0;
        capacity = capacityParam;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        DLinkedNode nodeVar = cache.get(key);
        if (nodeVar == null) {
            return -1;
        }
        moveToHead(nodeVar);
        return nodeVar.value;
    }

    public void put(int key, int value) {
        DLinkedNode nodeVar = cache.get(key);
        if (nodeVar == null) {
            DLinkedNode newNode = new DLinkedNode(key, value);
            cache.put(key, newNode);
            addToHead(newNode);
            size++;
            if (size > capacity) {
                DLinkedNode tailVar = removeTail();
                cache.remove(tailVar.key);
                size--;
            }
        } else {
            nodeVar.value = value;
            moveToHead(nodeVar);
        }

    }

    private void addToHead(DLinkedNode node) {
        DLinkedNode temp = head.next;
        head.next = node;
        node.pre = head;
        node.next = temp;
        temp.pre = node;
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);

    }

    private DLinkedNode removeTail() {
        DLinkedNode nodeVar = tail.pre;
        removeNode(nodeVar);
        return nodeVar;
    }

}