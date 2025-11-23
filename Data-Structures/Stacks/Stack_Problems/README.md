# MAX Area in Histogram
* **NSR[i]** = index of next smaller element on the right
  (or `arr.length` if none)
* **NSL[i]** = index of next smaller element on the left
  (or `-1` if none)
* Rectangle width = `nsr[i] - nsl[i] - 1`
* Area = `height * width`
