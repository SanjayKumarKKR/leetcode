func flipAndInvertImage(image [][]int) [][]int {
    for i:=0;i<len(image);i++{
        for j:=0;j<(len(image[i])+1)/2;j++{
            t:=image[i][j]^1
            image[i][j]=image[i][len(image[i])-j-1]^1
            image[i][len(image[i])-j-1]=t
            
        }
        
        
    }
    
    return image
}