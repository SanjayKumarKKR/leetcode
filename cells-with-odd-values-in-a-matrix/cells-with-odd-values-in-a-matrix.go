func oddCells(m int, n int, indices [][]int) int {
    matrix:= make([][]int, m,m)
    for i:=0;i<m;i++{
        matrix[i] = make([]int,n)
    }
    // fmt.Println(matrix)
    for i:=0;i<len(indices);i++{
        row := indices[i][0]
        for j:=0;j<n;j++{
            matrix[row][j]+=1
        }
        // fmt.Println(matrix)
        col := indices[i][1]
        for j:=0;j<m;j++{
            matrix[j][col]++
        }
        // fmt.Println(matrix)
    }
    odd:=0
    for i:=0;i<len(matrix);i++{
        for j:=0;j<len(matrix[i]);j++{
            if matrix[i][j]%2!=0{
                odd++
            }
        }
    }
        
    return odd
}