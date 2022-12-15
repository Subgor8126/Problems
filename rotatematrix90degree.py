class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        a=len(matrix[0])
        for row in range(0,a):
            for col in range(row,a):
                matrix[col][row],matrix[row][col]=matrix[row][col], matrix[col][row]
        for i in range(0,a):
            matrix[i].reverse()
        """
        Do not return anything, modify matrix in-place instead.
        """
