# Optional Class
- [Optional class doc](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html)
- To avoid Null pointer exception/null related issues,  we use optional class

# There is three-way to create optional object using methods
1. empty = Returns an empty Optional instance;
2. of = an Optional with the value present,null pointer exception is occurred when value is null.
3. ofNullable = an Optional with a present value if the specified value is non-null, otherwise an empty Optional, not null pointer exception is occurred if value is null