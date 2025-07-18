class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        set_i = set()  
        set_j = set()  

       
        if not matrix or not matrix[0]:
            return
            
        num_rows = len(matrix)
        num_cols = len(matrix[0])

        
        for i in range(num_rows):
            for j in range(num_cols):
                if matrix[i][j] == 0:
                    set_i.add(i)
                    set_j.add(j)

        
        for k in range(num_rows):
            if k in set_i:
                for l in range(num_cols):
                    matrix[k][l] = 0

        
        for k in range(num_cols):
            if k in set_j:
                for l in range(num_rows):
                    matrix[l][k] = 0
        