package dsa

import (
	"fmt"
)

// Solution struct can be used if you need to attach more functionalities later
type Solution struct{}

// containsDuplicate checks if there are duplicates in the slice
func (s Solution) containsDuplicate(nums []int) bool {
	unique_set := make(map[int]struct{}) // Using a map to mimic Java's HashSet
	for _, x := range nums {
		if _, exists := unique_set[x]; exists {
			// If the element is already in the set, return true
			return true
		}
		unique_set[x] = struct{}{} // Add the element to the set
	}
	// Return false if no duplicates are found
	return false
}

func main() {
	solution := Solution{}

	nums1 := []int{1, 2, 3, 4}
	fmt.Println(solution.containsDuplicate(nums1)) // Expected output: false

	nums2 := []int{1, 2, 3, 1}
	fmt.Println(solution.containsDuplicate(nums2)) // Expected output: true

	nums3 := []int{}
	fmt.Println(solution.containsDuplicate(nums3)) // Expected output: false

	nums4 := []int{3, 2, 6, -1, 2, 1}
	fmt.Println(solution.containsDuplicate(nums4)) // Expected output: true
}
