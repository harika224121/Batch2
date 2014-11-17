package sort;

import junit.framework.Assert;

import org.junit.Test;
 

import java.util.Arrays;
 
public class SorterTest {
  @Test
  public void SortEmptyList_ShouldReturnEmptyList() {
    Assert.assertTrue(Arrays.equals(new int[]{},
                        Sorter.Sort(new int[]{})));
 }
 
 @Test
 public void SortListWithOneElement_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{25},
                       Sorter.Sort(new int[]{25})));
 }
 
 @Test
 public void SortListWithTwoElementsInCorrectOrder_ShouldReturnSameList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2},
                       Sorter.Sort(new int[]{1, 2})));
 }
 
 @Test
 public void SortListWithTwoElementsInReverseOrder_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{5, 8},
                       Sorter.Sort(new int[]{8, 5})));
 }
 
 @Test
 public void SortListWithSameTwoElementsr_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{2, 2},
                       Sorter.Sort(new int[]{2, 2})));
 }
 
 @Test
 public void SortListWithThreeElementsInCorrectOrder_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},
                       Sorter.Sort(new int[]{1, 2, 3})));
 }
 
 @Test
 public void SortListWithThreeElementsFirstTwoSwapped_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},
                       Sorter.Sort(new int[]{2, 1, 3})));
 }
 
 @Test
 public void SortListWithThreeElementslastTwoSwapped_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},
                       Sorter.Sort(new int[]{1, 3, 2})));
 }
 
 @Test
 public void SortListWithThreeElementslReverseOrder_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3},
                       Sorter.Sort(new int[]{3, 2, 1})));
 }
 
 @Test
 public void SortListWithFourElementslReverseOrder_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3,4},
                       Sorter.Sort(new int[]{4,3, 2, 1})));
 }
 @Test
 public void SortListWithNElementaRandomOrder_ShouldReturnSortedList() {
   Assert.assertTrue(Arrays.equals(new int[]{1, 2, 3, 4, 5, 6, 6, 7, 8},
                       Sorter.Sort(new int[]{8,7,6,6,5,4,3,2,1})));
 }
}
