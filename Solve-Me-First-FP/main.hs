solve a b = a + b

main :: IO ()
main = do
  a <- readLn 
  b <- readLn
  let sum = solve a b
  print sum  