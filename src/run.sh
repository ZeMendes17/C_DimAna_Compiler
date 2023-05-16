antlr4-build
cd Precompiler/
echo "Creating Temporary file"
antlr4-run "../../examples/$1"
cd ../Compiler/
echo "Running Program"
antlr4-run ../../examples/temp.da
echo "Deleting Temporary file"
rm ../../examples/temp.da
echo "Closing..."
