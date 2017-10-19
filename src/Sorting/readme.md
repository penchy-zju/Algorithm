两两比较排序方法的时间复杂度不会优于O(nlgn)，
这可以通过构造决策树来证明，决策树的每个非叶子节点表示一次比较，
算法所用的时间即从决策树定点到叶子节点路径的时间，
每个叶子节点表示排序的一个可能性，及对于输入n，至少有n！个叶子节点，
对于二叉决策树，那么高度至少为要大于nlgn。
2^h > n! --> h > lg(n!) > lg(n^n) = nlgn

其他线性性时间排序方法：
计数排序：
这里要排序的数应该在一个小的范围（domain）里，然后统计每个数出现的次数

桶排序：
这个方法类似计数排序，不同的在于，计数排序统计的是每个确切数字出现的次数，
而桶排序是将数字出现范围划分为N个不同的范围，属于某个范围的数字放入同一个桶里，
然后桶里再用其他方法排序。可以知道桶排序适用于待排序数字满足平均分布的情况，
这样落在每个桶里的数字就不会很多，桶内用其他方法排序，基本线性时间完成。

基数排序：(位数一致)
基数排序基于这样一个事实，排得时候先从低位排，这时候就认为高位都是一致的，低位说了算，
然后逐渐往高位排，高位排序优先级要高于低位排好的，这样当从低到高所有位数排完后，
最后的顺序也就决定了。基数排序的时间复杂度依赖于位数的切割。
234        231       231       231
463        463       234       234
856        234       548       364
231   -->  364  -->  856  -->  369
548        856       463       463
369        548       364       548
364        369       369       856