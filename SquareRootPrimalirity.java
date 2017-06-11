#include<bits/stdc++.h>
using namespace std;
int main(){
	ios::sync_with_stdio(false);
	char ar[5][5],br[1000];
	pair<char,char> fin[26][26];
	cout<<"Enter the key of the cipher\n";
	cin>>br;
	pair<int,int> pa[26];
	int ptr=0, l=strlen(br),has[26]={0}, j=0,i=0,flag=0;
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			while(1){
				if(ptr==l){
					flag=1;
					break;}
				if(has[br[ptr]-'a']==0){
					break;}
				ptr++;}
			if(flag==1)
				break;
			if(br[ptr]=='i'||br[ptr]=='j'){
				ar[i][j]=br[ptr];
				has['i'-'a']=1;
				has['j'-'a']=1;}
			else{
				ar[i][j]=br[ptr];
				has[br[ptr]-'a']=1;}}
		if(flag==1)
			break;}
	int temp=0;
	//cout<<i<<" "<<j<<endl;
	for(int ii=i;ii<5;ii++){
		if(ii!=i)
			j=0;
		for(;j<5;j++){
			for(int t=temp;t<26;t++)