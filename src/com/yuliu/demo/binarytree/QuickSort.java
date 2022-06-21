package com.yuliu.demo.binarytree;

import java.util.Arrays;

/**
 * 1.5������,
 * 2.ѭ�����Һ����,
 * 3.������׼ֵ��λ��ֵ
 * 4.�ֿ�����ݹ�,����,�ݹ�
 * 5.low>=high�����ݹ�
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 6, 8, 3, 10, 4, 6};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int low, int high) {
        int p, i, j, temp;

        if (low >= high) {
            return;
        }
        //p���ǻ�׼��,�������ÿ������ĵ�һ��
        p = arr[low];
        i = low;
        j = high;
        while (i < j) {
            //�ұߵ�����С��p��ֵʱֹͣѭ��
            while (arr[j] >= p && i < j) {
                j--;
            }

            //����һ�����ұ߿�ʼ������������ѭ�����ܵ����������н��������������룩

            //��ߵ����ִ���p��ֵʱֹͣѭ��
            while (arr[i] <= p && i < j) {
                i++;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];//�����arr[i]һ����ͣС��p�ģ�����i��j������i����ֵһ����С��p��(j����)
        arr[i] = p;
        quickSort(arr, low, j - 1);  //����߿���
        quickSort(arr, j + 1, high); //���ұ߿���

    }
}