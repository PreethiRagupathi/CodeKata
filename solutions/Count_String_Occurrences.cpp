// Problem Statement:
// Given a sentence and string S, find how many times S occurs in the given sentence.If S is not found in the sentence print -1
//
//
//
//
// Input Description:
// Input Size : |sentence| <= 1000000(complexity O(n)).
//
//
//
//
// Output Description:
// The output is the number of times S occurs in the given sentence, or -1 if S is not found.
//
//
//
//
// Sample Input:
// I enjoy doing codekata
// codekata
//
//
//
//
// Sample Output:
// 1

#include <string>
using namespace std;
int main() {
    string name;
    getline(cin, name);
    string word;
    getline(cin, word);
    if (name.find(word) != string::npos) {
        cout << 1;
    } else {
        cout << -1;
    }
    return 0;
}

namespace local
snprintf keyword
vsnprintf keyword
nullptr keyword
namespace keyword
noexcept keyword
strncpy keyword
wcsncpy keyword
longjmp keyword