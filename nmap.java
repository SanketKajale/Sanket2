ifconfig/all
nmap -sn 192.168.232.128/24
nmap -sS 192.168.232.2 -O

to scan open port
nmap -sT DESKTOP-6T7OPQ3

to perform os fingerpriting
nmap -O -F 192.168.5.10
Increasing version detection intensity
# nmap -sV --version-intensity 9 <target>
Aggressive detection mode
# nmap -A <target>
Configuring OS detection
#nmap -O --osscan-guess <target>

scan the most populer port
nmap --top-ports 20 192.168.5.10