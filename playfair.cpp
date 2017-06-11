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
			for(int t=temp;t<26;t++){
				if(has[t]==0){
					if(temp+'a'=='i')
						has['j'-'a']=1;
					ar[ii][j]=t+'a';
					has[temp]=1;
					temp=t+1;
					break;}}}}
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++)
			cout<<ar[i][j]<<" ";
		cout<<"\n";}
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(ar[i][j]=='i'||ar[i][j]=='j'){
				pa['i'-'a'].first=i;
				pa['i'-'a'].second=j;
				pa['j'-'a'].first=i;
				pa['j'-'a'].second=j;}
			else{
				pa[ar[i][j]-'a'].first=i;
				pa[ar[i][j]-'a'].second=j;}}}
	for(int i=0;i<26;i++){
		for(int j=i+1;j<26;j++){
			if(pa[i].first==pa[j].first){
				fin[i][j].first=ar[pa[i].first][(pa[i].second+1)%5];
				fin[i][j].second=ar[pa[j].first][(pa[j].second+1)%5];}
			else if(pa[i].second==pa[j].second)	{
				fin[i][j].first=ar[(pa[i].first+1)%5][pa[i].second];
				fin[i][j].second=ar[(pa[j].first+1)%5][pa[j].second];}
			else{
				fin[i][j].first=ar[pa[i].first][pa[j].second];
				fin[i][j].second=ar[pa[j].first][pa[i].second];}}}
	for(int i=0;i<26;i++){
		for(int j=0;j<i;j++){
			fin[i][j].first=fin[j][i].second;
			fin[i][j].second=fin[j][i].first;}}
	cout<<"Enter the plain text\n";
	char pla[100000];
	cin>>pla;
	int lk=strlen(pla);
	printf("The encrypted string is\n");
	for(int i=0;i<lk;i+=2){
		if((i+1)==lk){
			cout<<fin[pla[i]-'a']['x'-'a'].first<<fin[pla[i]-'a']['x'-'a'].second;}
		else if(pla[i]!=pla[i+1]){
cout<<fin[pla[i]-'a'][pla[i+1]-'a'].first<<fin[pla[i]-'a']pla[i+1]-'a'].second;}
	else{	cout<<fin[pla[i]-'a']['x'-'a'].first<<fin[pla[i]-'a']['x'-'a'].second;
			i--;}}
	cout<<endl;}
