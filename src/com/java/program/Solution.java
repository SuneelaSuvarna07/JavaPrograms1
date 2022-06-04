package com.java.program;

class Solution {
	public static void main(String[] args) {
		int nums[] = { 1,1};

		int size = nums.length;
		int count = 1;
		int max = 0;
		if (size == 1) {
			if (nums[0] == 1) {
				System.out.println(1);
				
			} else {
				System.out.println(0);
			}
		}

		else {
			for (int i = 0; i < size; i++) {
				if (nums[i] == 1) {
					count = 1;

					for (int j = i + 1; j < size; j++) {

						if (nums[i] == nums[j]) {
							count++;
							if (max < count) {
								max = count;
							}

						} else {
							count = 1;
							break;
						}
					}if (max < count) {

						max = count;
					}

				} else {
					count = 0;
					if (max < count) {

						max = count;
					}

				}
			}
			System.out.println(max);
		}

		
	}
}
